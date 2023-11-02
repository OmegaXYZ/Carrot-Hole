<template>
    <div id="home">
        <!-- breadcrumb -->
        <nav class="text-sm font-semibold mb-6" aria-label="Breadcrumb">
            <ol class="list-none p-0 inline-flex">
                <li class="flex items-center text-blue-500">
                    <a href="#" class="text-gray-700">Home</a>
                    <svg class="fill-current w-3 h-3 mx-3" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512">
                        <path
                            d="M285.476 272.971L91.132 467.314c-9.373 9.373-24.569 9.373-33.941 0l-22.667-22.667c-9.357-9.357-9.375-24.522-.04-33.901L188.505 256 34.484 101.255c-9.335-9.379-9.317-24.544.04-33.901l22.667-22.667c9.373-9.373 24.569-9.373 33.941 0L285.475 239.03c9.373 9.372 9.373 24.568.001 33.941z" />
                    </svg>
                </li>
                <li class="flex items-center">
                    <a href="#" class="text-gray-600">Dashboard</a>
                </li>
            </ol>
        </nav>
        <!-- breadcrumb end -->

        <div class="lg:flex justify-between items-center mb-6">
            <p class="text-2xl font-semibold mb-2 lg:mb-0">Good afternoon, Joe!</p>
            <button
                class="bg-blue-500 hover:bg-blue-600 focus:outline-none rounded-lg px-6 py-2 text-white font-semibold shadow">View
                Logs</button>
        </div>
        <div class="flex flex-wrap -mx-3">

            <div class="w-full xl:w-1/3 px-3">
                <p class="text-xl font-semibold mb-4">Recent Sales</p>

                <div class="w-full bg-white border rounded-lg p-4 mb-8 xl:mb-0">
                    <canvas id="buyers-chart" width="600" height="400"></canvas>
                </div>
            </div>

            <div class="w-full xl:w-1/3 px-3">
                <p class="text-xl font-semibold mb-4">Recent Reviews</p>

                <div class="w-full bg-white border rounded-lg p-4 mb-8 xl:mb-0">
                    <canvas id="reviews-chart" width="600" height="400"></canvas>
                </div>
            </div>

            <div class="w-full xl:w-1/3 px-3">
                <p class="text-xl font-semibold mb-4">Recent Transactions</p>
                <div class="w-full bg-white border rounded-lg p-4">
                    <div class="w-full bg-gray-100 border rounded-lg flex justify-between items-center px-4 py-2 mb-4">
                        <div>
                            <p class="font-semibold text-xl">Trent Murphy</p>
                            <p>Product 1</p>
                        </div>
                        <span class="text-green-500 font-semibold text-lg">$25.00</span>
                    </div>

                    <div class="w-full bg-gray-100 border rounded-lg flex justify-between items-center px-4 py-2 mb-4">
                        <div>
                            <p class="font-semibold text-xl">Joseph Brent</p>
                            <p>Product 34</p>
                        </div>
                        <span class="text-red-500 font-semibold text-lg">$74.99</span>
                    </div>

                    <div class="w-full bg-gray-100 border rounded-lg flex justify-between items-center px-4 py-2 mb-4">
                        <div>
                            <p class="font-semibold text-xl">Jacob Bator</p>
                            <p>Product 23</p>
                        </div>
                        <span class="text-green-500 font-semibold text-lg">$14.95</span>
                    </div>

                    <div class="w-full bg-gray-100 border rounded-lg flex justify-between items-center px-4 py-2">
                        <div>
                            <p class="font-semibold text-xl">Alex Mason</p>
                            <p>Product 66</p>
                        </div>
                        <span class="text-green-500 font-semibold text-lg">$44.99</span>
                    </div>
                </div>
            </div>

        </div>

    </div>
</template>

<script>
import { Chart } from 'chart.js'

export default {
    name: 'DashboardHome',
    data() {
        return {
            buyersData: {
                type: 'line',
                data: {
                    labels: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
                    datasets: [{
                        backgroundColor: "rgba(99,179,237,0.4)",
                        strokeColor: "#63b3ed",
                        pointColor: "#fff",
                        pointStrokeColor: "#63b3ed",
                        data: [203, 156, 99, 251, 305, 247, 256]
                    },
                    {
                        backgroundColor: "rgba(198,198,198,0.4)",
                        strokeColor: "#f7fafc",
                        pointColor: "#fff",
                        pointStrokeColor: "#f7fafc",
                        data: [86, 97, 144, 114, 94, 108, 156]
                    }]
                },
                options: {
                    legend: {
                        display: false
                    },
                    scales: {
                        yAxes: [{
                            gridLines: {
                                display: false
                            },
                            ticks: {
                                display: false
                            }
                        }],
                        xAxes: [{
                            gridLines: {
                                display: false
                            }
                        }]
                    }
                }
            },
            reviewsData: {
                type: 'bar',
                data: {
                    labels: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
                    datasets: [{
                        backgroundColor: "rgba(99,179,237,0.4)",
                        strokeColor: "#63b3ed",
                        pointColor: "#fff",
                        pointStrokeColor: "#63b3ed",
                        data: [203, 156, 99, 251, 305, 247, 256]
                    }]
                },
                options: {
                    legend: {
                        display: false
                    },
                    scales: {
                        yAxes: [{
                            gridLines: {
                                display: false
                            },
                            ticks: {
                                display: false
                            }
                        }],
                        xAxes: [{
                            gridLines: {
                                display: false
                            }
                        }]
                    }
                }

            }
        }
    },
    mounted() {
        new Chart(document.getElementById('buyers-chart'), this.buyersData)
        new Chart(document.getElementById('reviews-chart'), this.reviewsData)
    }
}
</script>